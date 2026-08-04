package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.MaterialAssetGroup.AssetInfo.class)
public class AssetInfo1901469592Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1007985445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007985445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_766009617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766009617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1939732334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939732334L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "suffix()Ljava/lang/String;", cancellable = true)
    private void suffix_766009121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766009121L))
            info.setReturnValue(null);
    }


}
