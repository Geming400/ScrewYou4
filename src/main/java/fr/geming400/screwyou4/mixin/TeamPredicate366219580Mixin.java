package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.entity.TeamPredicate.class)
public class TeamPredicate366219580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1751731839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1751731839L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__769240395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769240395L))
            info.setReturnValue("0iN/gfa=RRr2z#>Z嶚.`[2<&QMt,ཐ/#JHN_9-Lun3>\"jW");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_404482322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404482322L))
            info.setReturnValue(1359677937);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void matches__1587972331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587972331L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "team()Ljava/lang/String;", cancellable = true)
    private void team__769240891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-769240891L))
            info.setReturnValue("O觯@d5{7rE:R4*kNT;Z>'m+[xF#e*g/Nw4x*7⋟Q]JoOqD`Kxw쌣p딒祣j秵u묮_c%}')i2`W1-p_YLg>uvD殷仹G#'6;:JV)");
    }


}
