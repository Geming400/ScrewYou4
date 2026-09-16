package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.MapItem.class)
public class MapItem1309796737Mixin {
        @Inject(at = @At("HEAD"), method = "update(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;)V", cancellable = true)
    private void update_799652426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(799652426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/server/level/ServerLevel;IIBZZ)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void create__1526318816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1526318816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSavedData(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private static void getSavedData__443995454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443995454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSavedData(Lnet/minecraft/world/level/saveddata/maps/MapId;Lnet/minecraft/world/level/Level;)Lnet/minecraft/world/level/saveddata/maps/MapItemSavedData;", cancellable = true)
    private static void getSavedData__105722511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-105722511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOn(Lnet/minecraft/world/item/context/UseOnContext;)Lnet/minecraft/world/InteractionResult;", cancellable = true)
    private void useOn_394679504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394679504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "inventoryTick(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void inventoryTick__1004511506(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1004511506L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onCraftedPostProcess(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void onCraftedPostProcess_1677767565(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1677767565L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderBiomePreviewMap(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private static void renderBiomePreviewMap_929344420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(929344420L))
            info.cancel();
    }


}
