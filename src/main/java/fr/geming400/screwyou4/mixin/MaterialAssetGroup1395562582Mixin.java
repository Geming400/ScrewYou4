package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.MaterialAssetGroup.class)
public class MaterialAssetGroup1395562582Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup$AssetInfo;", cancellable = true)
    private void base__1210688860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1210688860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_486936314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(486936314L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2128981189(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2128981189L))
            info.setReturnValue("C4U`Z8n\u28EA\u511BE%gq\u4A6C+]k.czg\"5\u1638^28;INq<?ES5N2\u807BE{1eLQmNgl2h<3=(?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1952914673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952914673L))
            info.setReturnValue(-932259047);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;)Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup;", cancellable = true)
    private static void create_1672040823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672040823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/util/Map;)Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup;", cancellable = true)
    private static void create__1104560712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104560712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assetId(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup$AssetInfo;", cancellable = true)
    private void assetId_117160836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117160836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "overrides()Ljava/util/Map;", cancellable = true)
    private void overrides__2092629577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092629577L))
            info.setReturnValue(null);
    }


}
