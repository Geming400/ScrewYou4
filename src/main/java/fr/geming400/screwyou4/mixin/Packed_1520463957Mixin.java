package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.village.poi.PoiSection.Packed.class)
public class Packed_1520463957Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_611837688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611837688L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2004079815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2004079815L))
            info.setReturnValue(")*\u5544w\uBAFBs(R^7.>!\u664F\uCA1DBAO\u9CDB\u33AFlc\"\u5773YlP\u3658^:#{s/pqQnf'de-CDsDoKh6 fm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2077816047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077816047L))
            info.setReturnValue(193283844);
    }

    @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid__701656999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-701656999L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "records()Ljava/util/List;", cancellable = true)
    private void records__1630812218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630812218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(Ljava/lang/Runnable;)Lnet/minecraft/world/entity/ai/village/poi/PoiSection;", cancellable = true)
    private void unpack_1804069063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1804069063L))
            info.setReturnValue(null);
    }


}
