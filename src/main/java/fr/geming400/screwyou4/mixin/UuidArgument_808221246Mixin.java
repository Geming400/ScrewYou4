package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.UuidArgument.class)
public class UuidArgument_808221246Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/util/UUID;", cancellable = true)
    private void parse__1978411514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978411514L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_514839502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(514839502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uuid()Lnet/minecraft/commands/arguments/UuidArgument;", cancellable = true)
    private static void uuid__1551195339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551195339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUuid(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/UUID;", cancellable = true)
    private static void getUuid_702968324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(702968324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1005427027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1005427027L))
            info.setReturnValue(null);
    }


}
