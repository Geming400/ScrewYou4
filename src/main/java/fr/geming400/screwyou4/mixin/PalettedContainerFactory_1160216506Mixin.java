package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.PalettedContainerFactory.class)
public class PalettedContainerFactory_1160216506Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_251590237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(251590237L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1930640030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1930640030L))
            info.setReturnValue("BV7 IAb\u0C0C%=T=)wM`\u332E4]93H`#re[Uc)ssZ4vH2:\u568CTS1\u63D1E&\"\uBCBD\u941C!)#mU}-^^N\u3041S,\uB238");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1717568596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717568596L))
            info.setReturnValue(-403456701);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/core/RegistryAccess;)Lnet/minecraft/world/level/chunk/PalettedContainerFactory;", cancellable = true)
    private static void create_1496654393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496654393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void defaultBlockState_1717634828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717634828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "defaultBiome()Lnet/minecraft/core/Holder;", cancellable = true)
    private void defaultBiome__262899466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-262899466L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStatesStrategy()Lnet/minecraft/world/level/chunk/Strategy;", cancellable = true)
    private void blockStatesStrategy_841407928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(841407928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeStrategy()Lnet/minecraft/world/level/chunk/Strategy;", cancellable = true)
    private void biomeStrategy__1845832023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845832023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockStatesContainerCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void blockStatesContainerCodec_1636732131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636732131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForBiomes()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void createForBiomes_2096464035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096464035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "biomeContainerCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void biomeContainerCodec__2099337644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099337644L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createForBlockStates()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void createForBlockStates_2111827521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111827521L))
            info.setReturnValue(null);
    }


}
