package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkType.class)
public class ChunkType_547368503Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/world/level/chunk/status/ChunkType;", cancellable = true)
    private static void values__1546244339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1546244339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/world/level/chunk/status/ChunkType;", cancellable = true)
    private static void valueOf_627774538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627774538L))
            info.setReturnValue(null);
    }


}
