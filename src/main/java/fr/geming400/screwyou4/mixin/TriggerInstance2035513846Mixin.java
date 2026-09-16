package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.ImpossibleTrigger.TriggerInstance.class)
public class TriggerInstance2035513846Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1126887578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1126887578L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1489029925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489029925L))
            info.setReturnValue("\"20B&25=&z+\u8F5C+c''9VZCd;C3=z\uD50F\uBA51\u0E4Aiq(u'|#iY{g-:\u935DM{PaDPt1[I=|YH,PNb:3VhuEW&x>F'0DCbXc>{`i\uA175!CNnc\u4944b1\u7ED5\u859A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1702101359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702101359L))
            info.setReturnValue(-852801076);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContextSource;)V", cancellable = true)
    private void validate__1999280344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1999280344L))
            info.cancel();
    }


}
