package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.PositionSourceType.class)
public class PositionSourceType_1346934999Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSourceType;", cancellable = true)
    private static void values_1620913220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620913220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSourceType;", cancellable = true)
    private static void valueOf_734023819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734023819L))
            info.setReturnValue(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.PositionSourceType.BOUNDING_BOX);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_1435143620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435143620L))
            info.setReturnValue(")x,@sPK\uA660\u3993P868\u50C15B>\u6132P*hz\uB411)\uCE2Bu=T{");
    }

    @Inject(at = @At("HEAD"), method = "getCoordinate(DDFLnet/minecraft/util/RandomSource;)D", cancellable = true)
    private void getCoordinate__525640909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-525640909L))
            info.setReturnValue(9.346111001433268E8D);
    }


}
