package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AmbientAdditionsSettings.class)
public class AmbientAdditionsSettings135991908Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1521504167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1521504167L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__999468067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999468067L))
            info.setReturnValue("7\u02CEqt^,`#n \uB75EFP\u1F35K\uCCC7xl_\u3BEE]j\u5BF8f[\u5833TvY8u\u9A7E|\uAD36yYzz4it(:+&6/SV8>&Q xm%-)!Q\uA0B9s@ySnBNi)kf=;du\u45D1%IFfG]x\u1C57TH8/c%");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_174254650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174254650L))
            info.setReturnValue(-1057367231);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent_1684867680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684867680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickChance()D", cancellable = true)
    private void tickChance_174249349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174249349L))
            info.setReturnValue(5.733687005276841E8D);
    }


}
