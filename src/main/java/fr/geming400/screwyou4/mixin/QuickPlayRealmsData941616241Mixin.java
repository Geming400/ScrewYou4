package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.main.GameConfig.QuickPlayRealmsData.class)
public class QuickPlayRealmsData941616241Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1967838796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967838796L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__193843734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193843734L))
            info.setReturnValue("Xa嶃,5\"^k`节狾*P捴M7}列#㉺OQn&d!Br뇸C||,&K_QD2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_979878983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979878983L))
            info.setReturnValue(2079302871);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_979894824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979894824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "realmId()Ljava/lang/String;", cancellable = true)
    private void realmId__193844230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-193844230L))
            info.setReturnValue("qH泲T=f0ꖤ鐴80=\"]^糸X\"zeH5/D;%?v[qtT.ED@帀Ox硽XC?mUh7PM;s");
    }


}
