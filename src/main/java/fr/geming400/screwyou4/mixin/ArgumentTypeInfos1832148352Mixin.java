package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.synchronization.ArgumentTypeInfos.class)
public class ArgumentTypeInfos1832148352Mixin {
        @Inject(at = @At("HEAD"), method = "bootstrap(Lnet/minecraft/core/Registry;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private static void bootstrap_472020321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(472020321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isClassRecognized(Ljava/lang/Class;)Z", cancellable = true)
    private static void isClassRecognized_1869550598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869550598L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "byClass(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo;", cancellable = true)
    private static void byClass_958870020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(958870020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Lcom/mojang/brigadier/arguments/ArgumentType;)Lnet/minecraft/commands/synchronization/ArgumentTypeInfo$Template;", cancellable = true)
    private static void unpack__937839025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-937839025L))
            info.setReturnValue(null);
    }


}
