package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.Equippable.Builder.class)
public class Builder_164748315Mixin {
        @Inject(at = @At("HEAD"), method = "build()Lnet/minecraft/world/item/equipment/Equippable;", cancellable = true)
    private void build__1001877814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001877814L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDispensable(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setDispensable__1817718549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817718549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAsset(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setAsset_1980481011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1980481011L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCameraOverlay(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setCameraOverlay_1604633088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604633088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSwappable(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setSwappable__65273440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65273440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDamageOnHurt(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setDamageOnHurt_2118943018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118943018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEquipSound(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setEquipSound__1052293807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052293807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShearingSound(Lnet/minecraft/core/Holder;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setShearingSound__1261698244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261698244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowedEntities([Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setAllowedEntities_737655534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737655534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAllowedEntities(Lnet/minecraft/core/HolderSet;)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setAllowedEntities_1372482799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372482799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCanBeSheared(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setCanBeSheared_1085887450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085887450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEquipOnInteract(Z)Lnet/minecraft/world/item/equipment/Equippable$Builder;", cancellable = true)
    private void setEquipOnInteract_2067145614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2067145614L))
            info.setReturnValue(null);
    }


}
