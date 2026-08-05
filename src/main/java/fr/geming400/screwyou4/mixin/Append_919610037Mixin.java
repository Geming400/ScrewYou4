package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.Append.class)
public class Append_919610037Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private void mode__811470536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811470536L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.APPEND);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;", cancellable = true)
    private void apply__38887763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-38887763L))
            info.setReturnValue(null);
    }


}
