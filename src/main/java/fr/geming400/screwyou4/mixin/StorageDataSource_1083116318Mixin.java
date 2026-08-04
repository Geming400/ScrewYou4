package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.data.StorageDataSource.class)
public class StorageDataSource_1083116318Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1826338720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1826338720L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__52344154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52344154L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1121379059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121379059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__1359950236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1359950236L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getData(Lnet/minecraft/commands/CommandSourceStack;)Ljava/util/stream/Stream;", cancellable = true)
    private void getData_1172499924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1172499924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1475997255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475997255L))
            info.setReturnValue(null);
    }


}
