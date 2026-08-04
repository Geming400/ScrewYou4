package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.attributes.AttributeMap.class)
public class AttributeMap920057422Mixin {
        @Inject(at = @At("HEAD"), method = "getValue(Lnet/minecraft/core/Holder;)D", cancellable = true)
    private void getValue__1828452034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828452034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;)V", cancellable = true)
    private void apply_140838834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(140838834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInstance(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/entity/ai/attributes/AttributeInstance;", cancellable = true)
    private void getInstance_1690018728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690018728L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack()Ljava/util/List;", cancellable = true)
    private void pack__1748573058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1748573058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAttribute(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void hasAttribute__1828430892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828430892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeAttributeModifiers(Lcom/google/common/collect/Multimap;)V", cancellable = true)
    private void removeAttributeModifiers_1507782508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1507782508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAttributesToUpdate()Ljava/util/Set;", cancellable = true)
    private void getAttributesToUpdate__908978064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908978064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBaseValue(Lnet/minecraft/core/Holder;)D", cancellable = true)
    private void getBaseValue__1828452034(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828452034L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assignAllValues(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;)V", cancellable = true)
    private void assignAllValues_1811893516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1811893516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "assignBaseValues(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;)V", cancellable = true)
    private void assignBaseValues_1811893516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1811893516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasModifier(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)Z", cancellable = true)
    private void hasModifier__1742635812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742635812L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModifierValue(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/Identifier;)D", cancellable = true)
    private void getModifierValue__1742656954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742656954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetBaseValue(Lnet/minecraft/core/Holder;)Z", cancellable = true)
    private void resetBaseValue__1828430892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828430892L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttributesToSync()Ljava/util/Set;", cancellable = true)
    private void getAttributesToSync__908978064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-908978064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSyncableAttributes()Ljava/util/Collection;", cancellable = true)
    private void getSyncableAttributes__893590850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-893590850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assignPermanentModifiers(Lnet/minecraft/world/entity/ai/attributes/AttributeMap;)V", cancellable = true)
    private void assignPermanentModifiers_1811893516(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1811893516L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTransientAttributeModifiers(Lcom/google/common/collect/Multimap;)V", cancellable = true)
    private void addTransientAttributeModifiers_1507782508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1507782508L))
            info.cancel();
    }


}
