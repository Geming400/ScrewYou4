package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.Graph.class)
public class Graph_2105806672Mixin {
        @Inject(at = @At("HEAD"), method = "depthFirstSearch(Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;Ljava/util/function/Consumer;Ljava/lang/Object;)Z", cancellable = true)
    private static void depthFirstSearch__1378886924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1378886924L))
            info.setReturnValue(true);
    }


}
