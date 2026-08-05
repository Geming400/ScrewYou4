package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrIdArgument.LootPredicateArgument.class)
public class LootPredicateArgument1183468195Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_2144728289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144728289L))
            info.setReturnValue(new java.lang.Object());
    }


}
