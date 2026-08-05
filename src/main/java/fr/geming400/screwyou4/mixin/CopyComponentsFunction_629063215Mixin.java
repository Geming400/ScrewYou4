package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyComponentsFunction.class)
public class CopyComponentsFunction_629063215Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1861144537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861144537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1695508468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695508468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyComponentsFromEntity(Lnet/minecraft/util/context/ContextKey;)Lnet/minecraft/world/level/storage/loot/functions/CopyComponentsFunction$Builder;", cancellable = true)
    private static void copyComponentsFromEntity_1033304779(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033304779L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_1408566442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1408566442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyComponentsFromBlockEntity(Lnet/minecraft/util/context/ContextKey;)Lnet/minecraft/world/level/storage/loot/functions/CopyComponentsFunction$Builder;", cancellable = true)
    private static void copyComponentsFromBlockEntity_1450724910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450724910L))
            info.setReturnValue(null);
    }


}
