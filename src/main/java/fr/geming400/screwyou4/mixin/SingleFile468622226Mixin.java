package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.texture.atlas.sources.SingleFile.class)
public class SingleFile468622226Mixin {
        @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/server/packs/resources/ResourceManager;Lnet/minecraft/client/renderer/texture/atlas/SpriteSource$Output;)V", cancellable = true)
    private void run__1418524316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1418524316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1854134485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854134485L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__666837749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666837749L))
            info.setReturnValue("12iF2 ^h)\u1DF4g2nr\u8957v&\u908F/bT=}U\u49F2tLI6,U\uBFEB&Wfa#nu9\u48D20}<1VKVTrf]\uA8E7k%C?<!e\u5072\"ALtI\u94F0\u16F7_JdMk\uD39E\u86D59N!\u5BD1$;=B}D9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_506884968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(506884968L))
            info.setReturnValue(1866657995);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2090491346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2090491346L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void resourceId__1974444327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974444327L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spriteId()Ljava/util/Optional;", cancellable = true)
    private void spriteId_714083648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714083648L))
            info.setReturnValue(null);
    }


}
