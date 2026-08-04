package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.Equippable.Builder.class)
public class Builder_164748315Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/equipment/Equippable;", cancellable = true)
    private void build_927711224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927711224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCameraOverlay(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setCameraOverlay__1995827383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995827383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDispensable(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setDispensable_582939979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582939979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAsset(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setAsset__183387579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183387579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDamageOnHurt(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setDamageOnHurt_582939979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582939979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowedEntities([Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setAllowedEntities__1535041259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1535041259L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowedEntities(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setAllowedEntities_426969046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426969046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEquipSound(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setEquipSound_1011494736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011494736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCanBeSheared(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setCanBeSheared_582939979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582939979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEquipOnInteract(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setEquipOnInteract_582939979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582939979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSwappable(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setSwappable_582939979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582939979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShearingSound(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setShearingSound_1011494736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011494736L))
            info.setReturnValue(null);
    }


}
