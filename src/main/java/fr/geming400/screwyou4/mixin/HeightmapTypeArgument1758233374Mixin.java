package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.HeightmapTypeArgument.class)
public class HeightmapTypeArgument1758233374Mixin {
        @Inject(at = @At("HEAD"), method = "getHeightmap(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/world/level/levelgen/Heightmap$Types;", cancellable = true)
    private static void getHeightmap__475608995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475608995L))
            info.setReturnValue(net.minecraft.world.level.levelgen.Heightmap.Types.WORLD_SURFACE_WG);
    }

    @Inject(at = @At("HEAD"), method = "heightmap()Lnet/minecraft/commands/arguments/HeightmapTypeArgument;", cancellable = true)
    private static void heightmap__1697377980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697377980L))
            info.setReturnValue(null);
    }


}
