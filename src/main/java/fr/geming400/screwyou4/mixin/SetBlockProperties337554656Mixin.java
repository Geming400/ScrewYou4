package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SetBlockProperties.class)
public class SetBlockProperties337554656Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__571071612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-571071612L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1107978181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107978181L))
            info.setReturnValue("&+D9qg}BVIe02Nfg\u5C4FP3ok}\u2B32?w6xfr*1=|\"\"o\u16AB,\u3586O\u4967'>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_894906747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894906747L))
            info.setReturnValue(-649782464);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_12360653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(12360653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_1980799411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980799411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "properties()Lnet/minecraft/world/item/component/BlockItemStateProperties;", cancellable = true)
    private void properties__1594640720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1594640720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1403999910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403999910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerGameEvent()Ljava/util/Optional;", cancellable = true)
    private void triggerGameEvent__1598233218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598233218L))
            info.setReturnValue(null);
    }


}
