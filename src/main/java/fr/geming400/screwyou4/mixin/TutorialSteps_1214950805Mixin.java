package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.tutorial.TutorialSteps.class)
public class TutorialSteps_1214950805Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__673896098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-673896098L))
            info.setReturnValue("/|\u59B2t\u6150\uC736kA\u97C3y-)^[`\u13E7zKX?dzK>\uBB80#4Q&i+;\u16E6f\uD37EY]5, -K/Y\u01B1hq$,wP7\u5C1E*&Ok9\u8E00CpE?sSzU9 q@7mTk,\u0C97\u3E1C4");
    }

    @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/tutorial/TutorialSteps;", cancellable = true)
    private static void values_1882329073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882329073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/tutorial/TutorialSteps;", cancellable = true)
    private static void valueOf_1451250634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1451250634L))
            info.setReturnValue(net.minecraft.client.tutorial.TutorialSteps.CRAFT_PLANKS);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/tutorial/Tutorial;)Lnet/minecraft/client/tutorial/TutorialStepInstance;", cancellable = true)
    private void create_1862288526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862288526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByName(Ljava/lang/String;)Lnet/minecraft/client/tutorial/TutorialSteps;", cancellable = true)
    private static void getByName__872826246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-872826246L))
            info.setReturnValue(net.minecraft.client.tutorial.TutorialSteps.MOVEMENT);
    }


}
