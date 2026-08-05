package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.MaterialAssetGroup.class)
public class MaterialAssetGroup1395562582Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup$AssetInfo;", cancellable = true)
    private void base__1024004845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1024004845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1513892455(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1513892455L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_260102607(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(260102607L))
            info.setReturnValue("m'诊Qu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1433825324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1433825324L))
            info.setReturnValue(-594409216);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup;", cancellable = true)
    private static void create_1166104443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1166104443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/util/Map;)Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup;", cancellable = true)
    private static void create__489918668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489918668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrides()Ljava/util/Map;", cancellable = true)
    private void overrides__609061058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609061058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetId(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup$AssetInfo;", cancellable = true)
    private void assetId__167924977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167924977L))
            info.setReturnValue(null);
    }


}
