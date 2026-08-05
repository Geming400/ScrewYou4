package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.CopyComponentsFunction.class)
public class CopyComponentsFunction_629063215Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_467715406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(467715406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyComponentsFromEntity(Lnet/minecraft/util/context/ContextKey;)Lnet/minecraft/world/level/storage/loot/functions/CopyComponentsFunction$Builder;", cancellable = true)
    private static void copyComponentsFromEntity_1144040403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144040403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1930050358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930050358L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1199972272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1199972272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copyComponentsFromBlockEntity(Lnet/minecraft/util/context/ContextKey;)Lnet/minecraft/world/level/storage/loot/functions/CopyComponentsFunction$Builder;", cancellable = true)
    private static void copyComponentsFromBlockEntity_1144040403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144040403L))
            info.setReturnValue(null);
    }


}
