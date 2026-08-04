package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.TutorialSteps.class)
public class TutorialSteps_1214950805Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName_79490333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79490333L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/tutorial/TutorialSteps;", cancellable = true)
    private static void values_986955599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986955599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/tutorial/TutorialSteps;", cancellable = true)
    private static void valueOf__1276524558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276524558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/tutorial/Tutorial;)Lnet/minecraft/client/tutorial/TutorialStepInstance;", cancellable = true)
    private void create__1027378286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1027378286L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/client/tutorial/TutorialSteps;", cancellable = true)
    private static void getByName__1276524558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1276524558L))
            info.setReturnValue(null);
    }


}
