package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapId.class)
public class MapId_274192455Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1659704713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659704713L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__861267521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861267521L))
            info.setReturnValue("딴亪g.|㑫bBf蚎僩.");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_312455196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312455196L))
            info.setReturnValue(2021002905);
    }

    @Inject(at = @At("HEAD"), method = "id()I", cancellable = true)
    private void id_312454700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312454700L))
            info.setReturnValue(623594900);
    }

    @Inject(at = @At("HEAD"), method = "key()Ljava/lang/String;", cancellable = true)
    private void key__861268017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-861268017L))
            info.setReturnValue("O/v+QGAv-ҏz'1}v1Vl;)d+)PAB'W6ꯆq|m,lM┘Ze_Xo胱cⵏSojUL[㾿:._;");
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip_2026441360(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2026441360L))
            info.cancel();
    }


}
