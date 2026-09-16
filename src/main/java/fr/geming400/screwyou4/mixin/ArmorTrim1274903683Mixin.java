package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.ArmorTrim.class)
public class ArmorTrim1274903683Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_366277415(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(366277415L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2045327208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045327208L))
            info.setReturnValue("nvT^{WYO-c5#4'`UoJ*D\u080CKp53^=q\u4D30c3Kg0DL[!l97\uA425\uA8EFQBeR cPyE\u37C0\u39A7CJGB\u8520}kvm\u079ECeb\u56E9&!9\u4B02<iQ+Ea:Mi\u94F5s\uB833\u2F7C6C6$G!");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1832255774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832255774L))
            info.setReturnValue(1937680965);
    }

    @Inject(at = @At("HEAD"), method = "pattern()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pattern__1573054737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573054737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1100316364(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1100316364L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "material()Lnet/minecraft/core/Holder;", cancellable = true)
    private void material__458675592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-458675592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "layerAssetId(Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void layerAssetId_1255091702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1255091702L))
            info.setReturnValue(null);
    }


}
