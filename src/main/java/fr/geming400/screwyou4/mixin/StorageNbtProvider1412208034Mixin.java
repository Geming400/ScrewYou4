package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.nbt.StorageNbtProvider.class)
public class StorageNbtProvider1412208034Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__918414248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-918414248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_503581766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503581766L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2112335737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112335737L))
            info.setReturnValue("}x*9$hk|=)0WHg\u96A4\uB8B7aRRZ$\u30FEo\u60461'\u6BC2fd\u9460|zXNDV_!pa<+t\u93F1");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1969560125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969560125L))
            info.setReturnValue(-679212044);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1180569852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1180569852L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1816314008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816314008L))
            info.setReturnValue(null);
    }


}
