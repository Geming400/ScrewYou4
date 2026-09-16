package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeMap.class)
public class AttributeMap920057422Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/core/Holder;)D", cancellable = true)
    private void getValue__1505192711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1505192711L))
            info.setReturnValue(5.678277000854963E8D);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;)V", cancellable = true)
    private void apply__1280338684(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1280338684L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;", cancellable = true)
    private void getInstance_1242544829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242544829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Ljava/util/List;", cancellable = true)
    private void pack_1055277079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1055277079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAttribute(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void hasAttribute_1986124022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1986124022L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "assignAllValues(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;)V", cancellable = true)
    private void assignAllValues__1879602944(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1879602944L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeAttributeModifiers(Lcom/google/common/collect/Multimap;)V", cancellable = true)
    private void removeAttributeModifiers__1735973112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1735973112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAttributesToUpdate()Ljava/util/Set;", cancellable = true)
    private void getAttributesToUpdate__1643163329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643163329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSyncableAttributes()Ljava/util/Collection;", cancellable = true)
    private void getSyncableAttributes__1353728032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1353728032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttributesToSync()Ljava/util/Set;", cancellable = true)
    private void getAttributesToSync_1730172973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730172973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assignBaseValues(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;)V", cancellable = true)
    private void assignBaseValues_1350372270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1350372270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assignPermanentModifiers(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;)V", cancellable = true)
    private void assignPermanentModifiers__1070411191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1070411191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBaseValue(Lnet/minecraft/core/Holder;)D", cancellable = true)
    private void getBaseValue_1625393064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625393064L))
            info.setReturnValue(5.678277008873583E8D);
    }

    @Inject(at = @At("HEAD"), method = "hasModifier(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void hasModifier__1777794067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777794067L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addTransientAttributeModifiers(Lcom/google/common/collect/Multimap;)V", cancellable = true)
    private void addTransientAttributeModifiers_872951171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(872951171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getModifierValue(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)D", cancellable = true)
    private void getModifierValue_2029085034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029085034L))
            info.setReturnValue(5.678277004652375E8D);
    }

    @Inject(at = @At("HEAD"), method = "resetBaseValue(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void resetBaseValue_480286821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(480286821L))
            info.setReturnValue(false);
    }


}
