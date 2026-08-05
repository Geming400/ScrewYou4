package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.storage.loot.functions.ListOperation.ReplaceAll.class)
public class ReplaceAll_1949875394Mixin {
        @Inject(at = @At("HEAD"), method = "mode()Lnet/minecraft/world/level/storage/loot/functions/ListOperation$Type;", cancellable = true)
    private void mode_218794821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(218794821L))
            info.setReturnValue(net.minecraft.world.level.storage.loot.functions.ListOperation.Type.INSERT);
    }

    @Inject(at = @At("HEAD"), method = "apply(Ljava/util/List;Ljava/util/List;I)Ljava/util/List;", cancellable = true)
    private void apply_991377594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991377594L))
            info.setReturnValue(null);
    }


}
