package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.PlayerDataStorage.class)
public class PlayerDataStorage1194215426Mixin {
        @Inject(at = @At("HEAD"), method = "load(Lnet/minecraft/server/players/NameAndId;)Ljava/util/Optional;", cancellable = true)
    private void load__1630739021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630739021L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "save(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void save_2134817072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2134817072L))
            info.cancel();
    }


}
