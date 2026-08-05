package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.SlotLoot.class)
public class SlotLoot758308106Mixin {
        @Inject(at = @At("HEAD"), method = "validate(Lnet/minecraft/world/level/storage/loot/ValidationContext;)V", cancellable = true)
    private void validate__260410665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-260410665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1824753360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1824753360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack__1865876961(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1865876961L))
            info.cancel();
    }


}
