package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.CommandStorage.class)
public class CommandStorage_1693920424Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void get_532007889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532007889L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "set(Lnet/minecraft/resources/Identifier;Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void set__452726465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-452726465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keys()Ljava/util/stream/Stream;", cancellable = true)
    private void keys__600534104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-600534104L))
            info.setReturnValue(null);
    }


}
