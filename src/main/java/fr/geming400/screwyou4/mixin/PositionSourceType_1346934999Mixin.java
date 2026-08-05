package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.PositionSourceType.class)
public class PositionSourceType_1346934999Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSourceType;", cancellable = true)
    private static void values_630578854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630578854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/item/enchantment/effects/SpawnParticlesEffect$PositionSourceType;", cancellable = true)
    private static void valueOf_1012509027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012509027L))
            info.setReturnValue(net.minecraft.world.item.enchantment.effects.SpawnParticlesEffect.PositionSourceType.ENTITY_POSITION);
    }

    @Inject(at = @At("HEAD"), method = "getCoordinate(DDFLnet/minecraft/util/RandomSource;)D", cancellable = true)
    private void getCoordinate__747367199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-747367199L))
            info.setReturnValue(6.393559005537142E8D);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_211474527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(211474527L))
            info.setReturnValue("9ZS*)j醝1GlcnVj.2wsd^.UAs煽僽KjQ9hJ( ]?r8c$]o]k/Gx&@'g@&<pq_y'z3p*e!$1&DꃈꢚG骩5>癞2<촯6BiMᕧO}]&[");
    }


}
