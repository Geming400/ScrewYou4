package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.ArgumentTypeInfos.class)
public class ArgumentTypeInfos1832148352Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private static void bootstrap__1360305037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360305037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byClass(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private static void byClass__668223517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-668223517L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private static void unpack__1549141055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549141055L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isClassRecognized(Ljava/lang/Class;)Z", cancellable = true)
    private static void isClassRecognized_1731976290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1731976290L))
            info.setReturnValue(false);
    }


}
