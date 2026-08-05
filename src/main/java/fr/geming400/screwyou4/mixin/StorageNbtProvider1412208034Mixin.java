package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.nbt.StorageNbtProvider.class)
public class StorageNbtProvider1412208034Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__575188370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-575188370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1497247003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497247003L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_276748059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276748059L))
            info.setReturnValue("\u6E56@Q[dD\uCD70#\u8B39|KM\uB474\u9D6E<pQ\u8F863ZVm;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1450470776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450470776L))
            info.setReturnValue(-151351344);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1030858519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1030858519L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1146905538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146905538L))
            info.setReturnValue(null);
    }


}
