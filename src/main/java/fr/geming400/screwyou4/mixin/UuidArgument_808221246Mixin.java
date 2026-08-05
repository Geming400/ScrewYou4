package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.UuidArgument.class)
public class UuidArgument_808221246Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/util/UUID;", cancellable = true)
    private void parse__1641910797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1641910797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1769481339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769481339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUuid(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/UUID;", cancellable = true)
    private static void getUuid_1114351155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114351155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuid()Lnet/minecraft/commands/arguments/UuidArgument;", cancellable = true)
    private static void uuid_1263899546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263899546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1762132052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1762132052L))
            info.setReturnValue(null);
    }


}
