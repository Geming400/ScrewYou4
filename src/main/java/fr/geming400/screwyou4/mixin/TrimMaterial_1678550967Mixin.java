package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.equipment.trim.TrimMaterial.class)
public class TrimMaterial_1678550967Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1230904071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1230904071L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_543090991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(543090991L))
            info.setReturnValue("fo0#[|V\u294DygP'-GYRJzgY7\"_1r\uBF3FuLQ[%uRM=c`&P\u70F5^e]{-oFG%.fJUvoc\u01366\u6711U</");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1716813708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1716813708L))
            info.setReturnValue(-1257461055);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description__498358199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-498358199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "assets()Lnet/minecraft/world/item/equipment/trim/MaterialAssetGroup;", cancellable = true)
    private void assets_2031259693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2031259693L))
            info.setReturnValue(null);
    }


}
