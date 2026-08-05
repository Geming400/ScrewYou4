package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.SetNameFunction.class)
public class SetNameFunction_188090985Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void run_1420172307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1420172307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setName(Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/level/storage/loot/functions/SetNameFunction$Target;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setName__1481653398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481653398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setName(Lnet/minecraft/network/chat/Component;Lnet/minecraft/world/level/storage/loot/functions/SetNameFunction$Target;Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/functions/LootItemConditionalFunction$Builder;", cancellable = true)
    private static void setName__370056539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370056539L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1254536238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1254536238L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createResolver(Lnet/minecraft/world/level/storage/loot/LootContext;Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Ljava/util/function/UnaryOperator;", cancellable = true)
    private static void createResolver_1940704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1940704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams_967594212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967594212L))
            info.setReturnValue(null);
    }


}
