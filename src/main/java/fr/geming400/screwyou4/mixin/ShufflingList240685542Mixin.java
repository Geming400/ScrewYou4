package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.behavior.ShufflingList.class)
public class ShufflingList240685542Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1011108571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011108571L))
            info.setReturnValue("7T\uBBE1C|(D4\u9420J\u3054qZAmjX&gNC\uA900\uA212JklZs`\" d-Lb3(.J['\u1B65y)>w.od\uA790UBZ\u44C1m'C");
    }

    @Inject(at = @At("HEAD"), method = "add(Ljava/lang/Object;I)Lnet/minecraft/world/entity/ai/behavior/ShufflingList;", cancellable = true)
    private void add__28390509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-28390509L))
            info.setReturnValue(new net.minecraft.world.entity.ai.behavior.ShufflingList());
    }

    @Inject(at = @At("HEAD"), method = "iterator()Ljava/util/Iterator;", cancellable = true)
    private void iterator_1874764340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874764340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stream()Ljava/util/stream/Stream;", cancellable = true)
    private void stream__497003813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-497003813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shuffle()Lnet/minecraft/world/entity/ai/behavior/ShufflingList;", cancellable = true)
    private void shuffle_1265863306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1265863306L))
            info.setReturnValue(new net.minecraft.world.entity.ai.behavior.ShufflingList());
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_592334355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592334355L))
            info.setReturnValue(null);
    }


}
