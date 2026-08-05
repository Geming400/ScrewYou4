package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.Append.class)
public class Append_919610037Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private void mode_1848997621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1848997621L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.INSERT);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;", cancellable = true)
    private void apply_580871167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(580871167L))
            info.setReturnValue(null);
    }


}
