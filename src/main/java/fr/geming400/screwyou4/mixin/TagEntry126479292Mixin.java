package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.TagEntry.class)
public class TagEntry126479292Mixin {
        @Inject(at = @At("HEAD"), method = "expand(Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/function/Consumer;)Z", cancellable = true)
    private void expand_1006283192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1006283192L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "expandTag(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void expandTag_1305549281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1305549281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1192924546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192924546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack_1797261521(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1797261521L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tagContents(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void tagContents__1141727467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1141727467L))
            info.setReturnValue(null);
    }


}
