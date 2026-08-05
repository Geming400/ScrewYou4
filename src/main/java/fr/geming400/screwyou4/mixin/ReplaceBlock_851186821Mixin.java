package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ReplaceBlock.class)
public class ReplaceBlock_851186821Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2058268217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2058268217L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__284273155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284273155L))
            info.setReturnValue("z\uB4CF{I\u6B005p0YmPTo'K#SH\"L_0zJ/M|{g\u0660fVUw)t20,_7\u8C8B\u2632\u566DC1[h!Z=RCd&+d\u4F84p\u94B3=t5F2IL>Yxr2a9p=LnLzlz]\u6FF4,");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_889449562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889449562L))
            info.setReturnValue(1936866056);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_2091938591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2091938591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset_466788356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466788356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate_1096648242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096648242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1707926752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707926752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void blockState__1081519681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081519681L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerGameEvent()Ljava/util/Optional;", cancellable = true)
    private void triggerGameEvent_1096648242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096648242L))
            info.setReturnValue(null);
    }


}
