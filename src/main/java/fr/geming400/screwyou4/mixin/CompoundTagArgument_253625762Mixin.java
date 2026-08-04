package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.CompoundTagArgument.class)
public class CompoundTagArgument_253625762Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void parse__1995178525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995178525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__39755982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-39755982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1560022511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1560022511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compoundTag()Lnet/minecraft/commands/arguments/CompoundTagArgument;", cancellable = true)
    private static void compoundTag__490836537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490836537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCompoundTag(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void getCompoundTag__1513933035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1513933035L))
            info.setReturnValue(null);
    }


}
