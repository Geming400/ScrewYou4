package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayRealmsData.class)
public class QuickPlayRealmsData941616241Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_32989973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(32989973L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1712039766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712039766L))
            info.setReturnValue("w\u1656\uBAE8`\u6E10|IvR}Cfg|5\uBBE2Dgrt--kjSM}\uBFB2B_c \u6249n#/TfH]C} F5a^p\u4184-@pwL2i8\u62013t&^t0p\u1101],$*Nkl?9P>+\u92BCf3cS|t@1\u50FCPrK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1498968332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498968332L))
            info.setReturnValue(-1435903235);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__1092531759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1092531759L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "realmId()Ljava/lang/String;", cancellable = true)
    private void realmId__62479228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62479228L))
            info.setReturnValue("8=)\u9E2E1G4");
    }


}
