package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.selector.options.EntitySelectorOptions.class)
public class EntitySelectorOptions_594058482Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/commands/arguments/selector/EntitySelectorParser;Ljava/lang/String;I)Lnet/minecraft/commands/arguments/selector/options/EntitySelectorOptions$Modifier;", cancellable = true)
    private static void get__226188130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226188130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bootStrap()V", cancellable = true)
    private static void bootStrap_632333468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(632333468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "suggestNames(Lnet/minecraft/commands/arguments/selector/EntitySelectorParser;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)V", cancellable = true)
    private static void suggestNames__1827992649(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1827992649L))
            info.cancel();
    }


}
