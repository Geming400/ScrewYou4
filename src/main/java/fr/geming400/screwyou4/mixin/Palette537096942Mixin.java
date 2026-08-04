package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.Palette.class)
public class Palette537096942Mixin {
        @Inject(at = @At("HEAD"), method = "blocks(Lnet/minecraft/world/level/block/Block;)Ljava/util/List;", cancellable = true)
    private void blocks_831216342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831216342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Ljava/util/List;", cancellable = true)
    private void blocks__2131533538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131533538L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jigsaws()Ljava/util/List;", cancellable = true)
    private void jigsaws__2131533538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131533538L))
            info.setReturnValue(null);
    }


}
