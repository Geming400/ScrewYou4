package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.CommandStorage.class)
public class CommandStorage_1693920424Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void get__357206041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357206041L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/resources/Identifier;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void set_231720669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(231720669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keys()Ljava/util/stream/Stream;", cancellable = true)
    private void keys_1483214108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483214108L))
            info.setReturnValue(null);
    }


}
