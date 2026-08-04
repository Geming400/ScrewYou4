package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.MapItem.class)
public class MapItem1309796737Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void update_1187159553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1187159553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/level/ServerLevel;IIBZZ)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void create_1458193564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1458193564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSavedData(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private static void getSavedData_2098051111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098051111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSavedData(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private static void getSavedData__1350735018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350735018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn__599046518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-599046518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onCraftedPostProcess(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void onCraftedPostProcess_482999454(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482999454L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderBiomePreviewMap(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void renderBiomePreviewMap__706572126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-706572126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void inventoryTick__677163115(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-677163115L))
            info.cancel();
    }


}
