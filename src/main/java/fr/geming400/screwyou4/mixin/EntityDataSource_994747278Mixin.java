package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.data.EntityDataSource.class)
public class EntityDataSource_994747278Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_86121009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(86121009L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1765170802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765170802L))
            info.setReturnValue("$V,tRt01BEWBFq<]U{jF");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1552099368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552099368L))
            info.setReturnValue(1225861400);
    }

    @Inject(at = @At("HEAD"), method = "selector()Lnet/minecraft/util/CompilableString;", cancellable = true)
    private void selector_1453239484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1453239484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getData(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/stream/Stream;", cancellable = true)
    private void getData__419316124(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419316124L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2061192531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061192531L))
            info.setReturnValue(null);
    }


}
