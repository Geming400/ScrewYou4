package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.providers.nbt.ContextNbtProvider.class)
public class ContextNbtProvider1817540318Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/level/storage/loot/LootContext;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get__513081964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-513081964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1410981724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410981724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forContextEntity(Lnet/minecraft/world/level/storage/loot/LootContext$EntityTarget;)Lnet/minecraft/world/level/storage/loot/providers/nbt/NbtProvider;", cancellable = true)
    private static void forContextEntity_1765035054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765035054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReferencedContextParams()Ljava/util/Set;", cancellable = true)
    private void getReferencedContextParams__1697923750(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697923750L))
            info.setReturnValue(null);
    }


}
