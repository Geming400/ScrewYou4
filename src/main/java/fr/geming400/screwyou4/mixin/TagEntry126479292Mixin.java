package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.entries.TagEntry.class)
public class TagEntry126479292Mixin {
        @Inject(at = @At("HEAD"), method = "expand(Lnet/minecraft/world/level/storage/loot/LootContext;Ljava/util/function/Consumer;)Z", cancellable = true)
    private void expand_2023484062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023484062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1862333016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1862333016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createItemStack(Ljava/util/function/Consumer;Lnet/minecraft/world/level/storage/loot/LootContext;)V", cancellable = true)
    private void createItemStack_46486520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(46486520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "expandTag(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void expandTag__1615308991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615308991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tagContents(Lnet/minecraft/tags/TagKey;)Lnet/minecraft/world/level/storage/loot/entries/LootPoolSingletonContainer$Builder;", cancellable = true)
    private static void tagContents__1615308991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615308991L))
            info.setReturnValue(null);
    }


}
