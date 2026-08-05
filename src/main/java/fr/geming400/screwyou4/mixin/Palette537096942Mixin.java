package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.Palette.class)
public class Palette537096942Mixin {
        @Inject(at = @At("HEAD"), method = "blocks(Lnet/minecraft/world/level/block/Block;)Ljava/util/List;", cancellable = true)
    private void blocks__670899824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670899824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blocks()Ljava/util/List;", cancellable = true)
    private void blocks__755224668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755224668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "jigsaws()Ljava/util/List;", cancellable = true)
    private void jigsaws__1334530864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334530864L))
            info.setReturnValue(null);
    }


}
